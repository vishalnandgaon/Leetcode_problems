// Last updated: 18/09/2025, 12:09:43
import java.util.*;

class TaskManager {

    static class Task {
        int userId;
        int taskId;
        int priority;

        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }

    private final Comparator<Task> cmp = (a, b) -> {
        if (a.priority != b.priority) return b.priority - a.priority;
        return b.taskId - a.taskId;
    };

    private final TreeSet<Task> set;
    private final Map<Integer, Task> taskMap;

    public TaskManager(List<List<Integer>> tasks) {
        set = new TreeSet<>(cmp);
        taskMap = new HashMap<>();
        for (List<Integer> t : tasks) {
            Task task = new Task(t.get(0), t.get(1), t.get(2));
            set.add(task);
            taskMap.put(t.get(1), task);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        set.add(task);
        taskMap.put(taskId, task);
    }

    public void edit(int taskId, int newPriority) {
        Task oldTask = taskMap.get(taskId);
        if (oldTask != null) {
            set.remove(oldTask);
            Task newTask = new Task(oldTask.userId, oldTask.taskId, newPriority);
            set.add(newTask);
            taskMap.put(taskId, newTask);
        }
    }

    public void rmv(int taskId) {
        Task task = taskMap.remove(taskId);
        if (task != null) {
            set.remove(task);
        }
    }

    public int execTop() {
        if (set.isEmpty()) return -1;
        Task top = set.pollFirst();
        taskMap.remove(top.taskId);
        return top.userId;
    }
}

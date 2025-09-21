// Last updated: 21/09/2025, 15:16:49
import java.util.*;

class MovieRentingSystem {

    private static class Avail implements Comparable<Avail> {
        int price, shop, movie;
        Avail(int price, int shop, int movie) {
            this.price = price;
            this.shop = shop;
            this.movie = movie;
        }
        public int compareTo(Avail o) {
            if (price != o.price) return price - o.price;
            return shop - o.shop;
        }
        public boolean equals(Object o) {
            if (!(o instanceof Avail)) return false;
            Avail a = (Avail) o;
            return price == a.price && shop == a.shop && movie == a.movie;
        }
        public int hashCode() {
            return Objects.hash(price, shop, movie);
        }
    }

    private static class Rented implements Comparable<Rented> {
        int price, shop, movie;
        Rented(int price, int shop, int movie) {
            this.price = price;
            this.shop = shop;
            this.movie = movie;
        }
        public int compareTo(Rented o) {
            if (price != o.price) return price - o.price;
            if (shop != o.shop) return shop - o.shop;
            return movie - o.movie;
        }
        public boolean equals(Object o) {
            if (!(o instanceof Rented)) return false;
            Rented r = (Rented) o;
            return price == r.price && shop == r.shop && movie == r.movie;
        }
        public int hashCode() {
            return Objects.hash(price, shop, movie);
        }
    }

    Map<Integer, TreeSet<Avail>> available; // movie -> available shops
    TreeSet<Rented> rented;                 // global rented movies
    Map<Long, Integer> priceMap;            // (shop,movie) -> price

    public MovieRentingSystem(int n, int[][] entries) {
        available = new HashMap<>();
        rented = new TreeSet<>();
        priceMap = new HashMap<>();

        for (int[] e : entries) {
            int shop = e[0], movie = e[1], price = e[2];
            priceMap.put(key(shop, movie), price);
            available.putIfAbsent(movie, new TreeSet<>());
            available.get(movie).add(new Avail(price, shop, movie));
        }
    }

    public List<Integer> search(int movie) {
        List<Integer> ans = new ArrayList<>();
        if (!available.containsKey(movie)) return ans;
        Iterator<Avail> it = available.get(movie).iterator();
        int count = 0;
        while (it.hasNext() && count < 5) {
            ans.add(it.next().shop);
            count++;
        }
        return ans;
    }

    public void rent(int shop, int movie) {
        int price = priceMap.get(key(shop, movie));
        Avail a = new Avail(price, shop, movie);
        available.get(movie).remove(a);
        rented.add(new Rented(price, shop, movie));
    }

    public void drop(int shop, int movie) {
        int price = priceMap.get(key(shop, movie));
        Rented r = new Rented(price, shop, movie);
        rented.remove(r);
        available.get(movie).add(new Avail(price, shop, movie));
    }

    public List<List<Integer>> report() {
        List<List<Integer>> ans = new ArrayList<>();
        Iterator<Rented> it = rented.iterator();
        int count = 0;
        while (it.hasNext() && count < 5) {
            Rented r = it.next();
            ans.add(Arrays.asList(r.shop, r.movie));
            count++;
        }
        return ans;
    }

    private long key(int shop, int movie) {
        return ((long)shop << 32) | (movie & 0xffffffffL);
    }
}

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String result = "Book[name=" + name + ",authors={";
        for (int i = 0; i < authors.length; i++){
            result += authors[i].toString();
            if (i < authors.length - 1) {
                result += ",";
            }
        }

        result += ",price=" + price + ",qty" + qty + "]";
        return result;
    }

    public String getAuthorNames() {
        String result = "";

        for (int i = 0; i < authors.length; i++) {
            result += authors[i].getName();
            if (i < authors.length - 1) {
                result += ",";
            }
        }
        
        return result;
    }
}

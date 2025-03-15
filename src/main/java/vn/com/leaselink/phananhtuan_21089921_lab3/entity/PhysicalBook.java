package vn.com.leaselink.phananhtuan_21089921_lab3.entity;

public class PhysicalBook extends Book{
    private String location; // Vị trí trên kệ

    public PhysicalBook(String title, String author, String genre, String location) {
        super(title, author, genre);
        this.location = location;
    }

    public String getLocation() { return location; }

    @Override
    public String getType() {
        return "Sách giấy";
    }
}

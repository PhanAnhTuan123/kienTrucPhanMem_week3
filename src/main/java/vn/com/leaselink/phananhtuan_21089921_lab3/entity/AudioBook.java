package vn.com.leaselink.phananhtuan_21089921_lab3.entity;

public class AudioBook extends Book{
    private int duration; // Thời lượng (phút)
    private String narrator; // Người đọc

    public AudioBook(String title, String author, String genre, int duration, String narrator) {
        super(title, author, genre);
        this.duration = duration;
        this.narrator = narrator;
    }

    public int getDuration() { return duration; }
    public String getNarrator() { return narrator; }

    @Override
    public String getType() {
        return "Sách nói";
    }
}

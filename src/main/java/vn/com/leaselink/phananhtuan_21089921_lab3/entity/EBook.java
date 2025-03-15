package vn.com.leaselink.phananhtuan_21089921_lab3.entity;

public class EBook extends Book{
    private String format; // PDF, EPUB, etc.
    private String downloadLink;

    public EBook(String title, String author, String genre, String format, String downloadLink) {
        super(title, author, genre);
        this.format = format;
        this.downloadLink = downloadLink;
    }

    public String getFormat() { return format; }
    public String getDownloadLink() { return downloadLink; }

    @Override
    public String getType() {
        return "Sách điện tử";
    }
}

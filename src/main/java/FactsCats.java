import com.fasterxml.jackson.annotation.JsonProperty;

public class FactsCats {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public FactsCats(@JsonProperty("id") String id,
                     @JsonProperty("text") String text,
                     @JsonProperty("type") String type,
                     @JsonProperty("user") String user,
                     @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Facts: {" +
                " id='" + id +
                ",\n\t text='" + text +
                ",\n\t type='" + type +
                ",\n\t user='" + user +
                ",\n\t upvotes='" + upvotes +
                "\n\t}";
    }
}
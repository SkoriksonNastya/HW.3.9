import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFacts {

    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public CatFacts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes){
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId(){
        return id;
    }

    public String getText(){
        return text;
    }

    public String getType(){
        return type;
    }

    public String getUser(){
        return user;
    }

    public int getUpvotes(){
        return upvotes;
    }

    @Override
    public String toString(){
        return "{Факт про кошачих:" + "\n" +
                "id: " + id + "\n" +
                "text: " + text + "\n" +
                "type: " + type + "\n" +
                "user: " + user + "\n" +
                "upvotes: " + upvotes + "\n" +
                "}\n";
    }
}

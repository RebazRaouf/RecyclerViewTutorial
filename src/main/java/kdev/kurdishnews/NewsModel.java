package kdev.kurdishnews;

/**
 * Created by reba on 2/27/18.
 */

public class NewsModel {

    private int id;
    private int resourceId;
    private String title;
    private String shortDetail;

    public NewsModel(int id,int resourceId, String title, String shortDetail){
        this.id = id;
        this.resourceId = resourceId;
        this.title = title;
        this.shortDetail = shortDetail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDetail() {
        return shortDetail;
    }

    public void setShortDetail(String shortTitle) {
        this.shortDetail = shortTitle;
    }

    public int getResourceId(){
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}

package com.app.myspotify;

public class AlbumModel {

    private String album_type;
    private String artistName;
    private String external_ids;
    private String external_urls;
    private String href;
    private String id;
    private String imageURL;
    private String label;
    private String name;
    private int popularity;
    private String releaseDate;
    private int totalTracks;
    private String type;

    public AlbumModel(String album_type, String artistName, String external_ids, String external_urls, String href, String id, String imageURL, String label, String name, int popularity, String releaseDate, int totalTracks, String type) {
        this.album_type = album_type;
        this.artistName = artistName;
        this.external_ids = external_ids;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.imageURL = imageURL;
        this.label = label;
        this.name = name;
        this.popularity = popularity;
        this.releaseDate = releaseDate;
        this.totalTracks = totalTracks;
        this.type = type;
    }

    public String getAlbum_type() {
        return album_type;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getExternal_ids() {
        return external_ids;
    }

    public String getExternal_urls() {
        return external_urls;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getTotalTracks() {
        return totalTracks;
    }

    public String getType() {
        return type;
    }

    public void setAlbum_type(String album_type) {
        this.album_type = album_type;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public void setExternal_ids(String external_ids) {
        this.external_ids = external_ids;
    }

    public void setExternal_urls(String external_urls) {
        this.external_urls = external_urls;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setTotalTracks(int totalTracks) {
        this.totalTracks = totalTracks;
    }

    public void setType(String type) {
        this.type = type;
    }
}

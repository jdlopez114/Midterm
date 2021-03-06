package nyc.c4q.josiel.midterm;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AudioTrack {

    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("deleted")
    @Expose
    private Object deleted;
    @SerializedName("trackId")
    @Expose
    private int trackId;
    @SerializedName("modified")
    @Expose
    private Object modified;
    @SerializedName("numberOfMeasures")
    @Expose
    private int numberOfMeasures;
//    @SerializedName("track")
//    @Expose
//    private Track track;
    @SerializedName("audioOffset")
    @Expose
    private double audioOffset;
    @SerializedName("snapToBeat")
    @Expose
    private int snapToBeat;
    @SerializedName("linkId")
    @Expose
    private int linkId;
    @SerializedName("duration")
    @Expose
    private double duration;
    @SerializedName("averageBpm")
    @Expose
    private int averageBpm;
    @SerializedName("videoOffset")
    @Expose
    private double videoOffset;

    /**
     *
     * @return
     * The origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     *
     * @param origin
     * The origin
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     *
     * @return
     * The created
     */
    public String getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The deleted
     */
    public Object getDeleted() {
        return deleted;
    }

    /**
     *
     * @param deleted
     * The deleted
     */
    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    /**
     *
     * @return
     * The trackId
     */
    public int getTrackId() {
        return trackId;
    }

    /**
     *
     * @param trackId
     * The trackId
     */
    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    /**
     *
     * @return
     * The modified
     */
    public Object getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    public void setModified(Object modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The numberOfMeasures
     */
    public int getNumberOfMeasures() {
        return numberOfMeasures;
    }

    /**
     *
     * @param numberOfMeasures
     * The numberOfMeasures
     */
    public void setNumberOfMeasures(int numberOfMeasures) {
        this.numberOfMeasures = numberOfMeasures;
    }

    /**
     *
     * @return
     * The track
     */
//    public Track getTrack() {
//        return track;
//    }
//
//    /**
//     *
//     * @param track
//     * The track
//     */
//    public void setTrack(Track track) {
//        this.track = track;
//    }

    /**
     *
     * @return
     * The audioOffset
     */
    public double getAudioOffset() {
        return audioOffset;
    }

    /**
     *
     * @param audioOffset
     * The audioOffset
     */
    public void setAudioOffset(double audioOffset) {
        this.audioOffset = audioOffset;
    }

    /**
     *
     * @return
     * The snapToBeat
     */
    public int getSnapToBeat() {
        return snapToBeat;
    }

    /**
     *
     * @param snapToBeat
     * The snapToBeat
     */
    public void setSnapToBeat(int snapToBeat) {
        this.snapToBeat = snapToBeat;
    }

    /**
     *
     * @return
     * The linkId
     */
    public int getLinkId() {
        return linkId;
    }

    /**
     *
     * @param linkId
     * The linkId
     */
    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    /**
     *
     * @return
     * The duration
     */
    public double getDuration() {
        return duration;
    }

    /**
     *
     * @param duration
     * The duration
     */
    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     *
     * @return
     * The averageBpm
     */
    public int getAverageBpm() {
        return averageBpm;
    }

    /**
     *
     * @param averageBpm
     * The averageBpm
     */
    public void setAverageBpm(int averageBpm) {
        this.averageBpm = averageBpm;
    }

    /**
     *
     * @return
     * The videoOffset
     */
    public double getVideoOffset() {
        return videoOffset;
    }

    /**
     *
     * @param videoOffset
     * The videoOffset
     */
    public void setVideoOffset(double videoOffset) {
        this.videoOffset = videoOffset;
    }

}
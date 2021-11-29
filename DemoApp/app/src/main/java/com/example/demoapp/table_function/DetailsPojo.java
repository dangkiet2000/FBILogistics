package com.example.demoapp.table_function;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetailsPojo {
    @SerializedName("stt")
    @Expose
    private String stt;

    @SerializedName("pol")
    @Expose
    private String pol;

    @SerializedName("pod")
    @Expose
    private String pod;

    @SerializedName("of20")
    @Expose
    private String of20;

    @SerializedName("of40")
    @Expose
    private String of40;

    @SerializedName("su20")
    @Expose
    private String su20;

    @SerializedName("su40")
    @Expose
    private String su40;

    @SerializedName("linelist")
    @Expose
    private String linelist;

    @SerializedName("notes")
    @Expose
    private String notes;

    @SerializedName("valid")
    @Expose
    private String valid;

    @SerializedName("notes2")
    @Expose
    private String notes2;

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public String getOf20() {
        return of20;
    }

    public void setOf20(String of20) {
        this.of20 = of20;
    }

    public String getOf40() {
        return of40;
    }

    public void setOf40(String of40) {
        this.of40 = of40;
    }

    public String getSu20() {
        return su20;
    }

    public void setSu20(String su20) {
        this.su20 = su20;
    }

    public String getSu40() {
        return su40;
    }

    public void setSu40(String su40) {
        this.su40 = su40;
    }

    public String getLinelist() {
        return linelist;
    }

    public void setLinelist(String linelist) {
        this.linelist = linelist;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }

    public String getNotes2() {
        return notes2;
    }

    public void setNotes2(String notes2) {
        this.notes2 = notes2;
    }
}

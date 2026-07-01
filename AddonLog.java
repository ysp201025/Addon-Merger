package com.example.addonmerger.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "addon_logs")
public class AddonLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String outputName;
    private int totalFilesMerged;
    private long finalSizeInBytes;
    private LocalDateTime timestamp;
    private String processedBy; // အလုပ်အဖွဲ့အတွက် မည်သူလုပ်ဆောင်သည်ကို မှတ်သားရန်

    public AddonLog() {}

    public AddonLog(String outputName, int totalFilesMerged, long finalSizeInBytes, String processedBy) {
        this.outputName = outputName;
        this.totalFilesMerged = totalFilesMerged;
        this.finalSizeInBytes = finalSizeInBytes;
        this.timestamp = LocalDateTime.now();
        this.processedBy = processedBy;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public String getOutputName() { return outputName; }
    public int getTotalFilesMerged() { return totalFilesMerged; }
    public long getFinalSizeInBytes() { return finalSizeInBytes; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getProcessedBy() { return processedBy; }
}

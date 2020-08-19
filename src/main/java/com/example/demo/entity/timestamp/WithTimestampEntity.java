package com.example.demo.entity.timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class WithTimestampEntity {
    @Column(columnDefinition = "timestamp", updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(columnDefinition = "timestamp")
    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

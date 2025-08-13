package com.vkostylev.edu.catsgram.model;

import lombok.Data;

@Data
public class Image {
    Long id;
    long postId;
    String originalFilename;
    String filePath;
}

package mediaDB;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uploaderDB.UploaderImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoImplTest {
    private Video video;
    private List<Tag> tags;

    @BeforeEach
    void init() {
    tags = new ArrayList<>();
    tags.add(Tag.News);
    video = new VideoImpl(new UploaderImpl("test"),"address",tags,1,1,1,1,"encoding");
    }

    @Test
    void getWidth() {
        int expected = 1;
        assertEquals(expected,video.getWidth());
    }

    @Test
    void getHeight() {
        int expected = 1;
        assertEquals(expected,video.getHeight());
    }

    @Test
    void getEncoding() {
        String expected = "encoding";
        assertEquals(expected,video.getEncoding());
    }


}
package mediaDB;

import org.junit.jupiter.api.Test;
import uploaderDB.UploaderImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LicensedAudioImplTest {

    @Test
    void getHolder() {
        List<Tag> tags = new ArrayList<>();
        tags.add(Tag.News);
        LicensedAudio licensedAudio = new LicensedAudioImpl(new UploaderImpl("test"), "address", tags, 1, 1, 1, "encoding", "holder");
        String expected = "holder";
        assertEquals(expected, licensedAudio.getHolder());
    }

}
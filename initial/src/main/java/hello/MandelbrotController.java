package hello;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MandelbrotController {

	@Autowired
	ServletContext servletContext;
    
    @RequestMapping("/mandel")
    public ResponseEntity<byte[]> mandel() throws IOException {
    	byte[] arr = new byte[100];
    	for(byte i = 0; i < 100; i++) {
    		arr[i] = i;
    	}
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(arr, headers, HttpStatus.CREATED);
    }
}
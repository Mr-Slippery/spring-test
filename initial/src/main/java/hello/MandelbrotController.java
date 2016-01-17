package hello;

import java.io.IOException;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MandelbrotController {

	@Autowired
	ServletContext servletContext;
    
    @RequestMapping("/mandel")
    public Mandel mandel(
    			@RequestParam(value="x", defaultValue="-1.0") double x, 
    			@RequestParam(value="y", defaultValue="-1.0") double y,
    			@RequestParam(value="r", defaultValue="2") double r,
    			@RequestParam(value="maxIter", defaultValue="128") long maxIter
    		) throws IOException {
    	return new Mandel(x, y, r, maxIter);
    }
}
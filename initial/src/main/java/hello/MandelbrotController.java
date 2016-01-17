package hello;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MandelbrotController {
    @RequestMapping("/mandel")
    public Mandel mandel(
    			@RequestParam(value="x", defaultValue="-1.0") double x, 
    			@RequestParam(value="y", defaultValue="-1.0") double y,
    			@RequestParam(value="dx", defaultValue="2") double dx,
    			@RequestParam(value="dy", defaultValue="2") double dy,
    			@RequestParam(value="di", defaultValue="0") int di,
    			@RequestParam(value="dj", defaultValue="0") int dj,
    			@RequestParam(value="maxIter", defaultValue="128") int maxIter
    		) throws IOException {
    	if (di > 4000 || dj > 4000) {
    		return null;
    	}
    	Mandel m = new Mandel(x, y, dx, dy, di, dj, maxIter);
    	m.computeMap();
    	return m;
    }
}
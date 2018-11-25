package tr.com.zulkufadsiz.api;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	
	@RequestMapping(value="/api/berlinClock", method = RequestMethod.GET )
	public String getTime() {
		
		Clock clock = Clock.system(ZoneId.of("Europe/Berlin"));
	    ZonedDateTime now = ZonedDateTime.now(clock);
	    String time = DateTimeFormatter.ISO_LOCAL_TIME.format(now);
		return time;
	}

	@RequestMapping(value="/api/berlinClock?time=", method = RequestMethod.GET )
	public String getTime2(@RequestParam(value="time")String time ) {
		
		return time;
	}
	
}

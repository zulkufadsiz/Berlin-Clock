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
	public String getTime(@RequestParam(value="time",required=false)String time) {
		 if(time == null) {
			 	Clock clock = Clock.system(ZoneId.of("Europe/Berlin"));
			    ZonedDateTime now = ZonedDateTime.now(clock);
			  time =  DateTimeFormatter.ISO_LOCAL_TIME.format(now);
		    }
		return time;
	}

	

	
}

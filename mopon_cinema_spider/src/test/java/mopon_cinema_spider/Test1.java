package mopon_cinema_spider;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.mopon.cinema.domain.Bug;
import com.mopon.cinema.rules.dao.BugMapper;


	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations = { "classpath:config/xml/spider-all.xml" })
	public class  Test1 {
		private static final Logger logger = Logger.getLogger(Test1.class);
		@Resource
		private BugMapper bugMapper;
	    @Test
	    public void testTicketSaleService()throws Exception{
	    	//int result;
	    	String  date ="2014";
	    	/*String value = String.valueOf(date);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");*/
	    	Bug bug=new Bug();
//	    	String format = sdf.format(value);
			bug.setCreatedatetime(date);
			bug.setId("1");
			bug.setName("wen");
			bug.setNote("你很不错！！");
			int insert = bugMapper.getInsert(bug);
			logger.info(insert);
	        //System.out.println("===================="+result);
	    }
	}


package com.rest;
import java.util.Date;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/inchcm")
public class Convert {
	private CardDao cardDao;
	public Convert() {
		cardDao = new CardDaoImpl();
	}
	@GET
	@Path("/in2cm/{a}")
	@Produces(MediaType.TEXT_HTML)
	public String inch2centimeter(@PathParam("a") double a){		
		System.out.println("in inch2centimeter()");
System.out.println(a);
		return "<h2>The value of "+a+"in is "+(a*2.54)+"cm </h2>";

		
	}
        @GET
	@Path("/details/{cardNo}/{name}/{cvv}")
	@Produces(MediaType.APPLICATION_JSON)
	public CardObject cardDetails(@PathParam("cardNo") String cardNo, @PathParam("name") String name,
			@PathParam("cvv") int cvv) {
		System.out.println(cardNo + "," + name + "," + cvv);
		CardObject co = null;
		//co = new CardObject(cardNo,name,new Date(),cvv);
               co = cardDao.getCardObject(cardNo);
	if(co==null || !co.validate(cardNo,name,cvv)) {
		  co = new CardObject(cardNo,null,null,0);
		}

		return co;
	}

}

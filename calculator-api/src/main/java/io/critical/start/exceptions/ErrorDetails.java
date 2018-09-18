package io.critical.start.exceptions;
import java.util.Date;

//Atributos dos detalhes dos erros a serem passados
public class ErrorDetails {
	
		private String message = "Teste";
		private String details;
		private Date time;
		
		public ErrorDetails() {
		    super();
		  }
		
		public ErrorDetails(Date time, String message, String details) {
		    super();
		    this.time = time;
		    this.message = message;
		    this.details = details;
		  }

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getDetails() {
			return details;
		}

		public void setDetails(String details) {
			this.details = details;
		}

		public Date getTime() {
			return time;
		}

		public void setTime(Date time) {
			this.time = time;
		}
		
		
	}




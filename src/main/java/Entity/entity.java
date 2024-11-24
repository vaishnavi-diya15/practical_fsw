package Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "user_responses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class entity {

	    @Id
	    private String id; 
	    private String userId;
	    private String testId;
	    private String response;
	    
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getTestId() {
			return testId;
		}
		public void setTestId(String testId) {
			this.testId = testId;
		}
		public String getResponse() {
			return response;
		}
		public void setResponse(String response) {
			this.response = response;
		}

}
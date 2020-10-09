package edu.chnu.patterns.objectPool;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@Builder
@NoArgsConstructor
public class WebMeeting {
	public static int debt = 0;

	private String id;
	private String title;
	private ServiceType type;
	private Status status;


	public WebMeeting(String id, String title, ServiceType type, Status status) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.status = status;

		switch (type) {
			case ZOOM: {
				debt += 10;
				break;
			}
			case HANGOUTS: {
				debt += 20;
				break;
			}
		}
	}

	public void startMeeting() {
		System.out.println(this);
		System.out.println("Debt = " + debt);
	}
}

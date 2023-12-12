package Todo5;

import java.util.Objects;

public class CourseInfo {
	private String providerName;
	private float duration;
	
	public CourseInfo(String providerName, float duration) {
		super();
		this.providerName = providerName;
		this.duration = duration;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duration, providerName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseInfo other = (CourseInfo) obj;
		return Float.floatToIntBits(duration) == Float.floatToIntBits(other.duration)
				&& Objects.equals(providerName, other.providerName);
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public CourseInfo() {
		
	}

}

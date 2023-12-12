package Todo5_Harish;

import java.util.Objects;

public class CourseInfo {
private String ProviderName;
private int duration;

void CourseInfo() {
	
}

public CourseInfo(String providerName, int duration) {
	super();
	ProviderName = providerName;
	this.duration = duration;
}

public String getProviderName() {
	return ProviderName;
}

public void setProviderName(String providerName) {
	ProviderName = providerName;
}

public int getDuration() {
	return duration;
}

public void setDuration(int duration) {
	this.duration = duration;
}

@Override
public int hashCode() {
	return Objects.hash(ProviderName, duration);
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
	return Objects.equals(ProviderName, other.ProviderName) && duration == other.duration;
}

}

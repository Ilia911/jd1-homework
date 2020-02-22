package by.htp.homework.progr_with_classes.task6;

public class Watch {

	private int hour;
	private int minute;
	private int second;

	public Watch() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public Watch(int hour, int minute, int second) {
		if (hour >= 24 || hour < 0) {
			hour = 0;
		}
		if (minute > 60 || minute < 0) {
			minute = 0;
		}
		if (second > 60 || second < 0) {
			second = 0;
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setHour(int hour) {
		if (hour > 24 || hour < 0) {
			hour = 0;
		}
		this.hour = hour;
	}

	public void setMinute(int minute) {
		if (minute > 60 || minute < 0) {
			minute = 0;
		}
		this.minute = minute;
	}

	public void setSecond(int second) {
		if (second > 60 || second < 0) {
			second = 0;
		}
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}
	

	public void addSecond(int second) {

		int all = this.hour * 60 * 60 + this.minute * 60 + this.second + second;

		if (all < 0) {
			all = Math.abs(all);
			if (all % 60 == 0) {
				this.second = 0;
			} else {
				this.second = 60 - all % 60;
			}

			all = all / 60;
			if (this.second != 0) {
				this.minute = 59 - all % 60;
			} else {
				if (all % 60 == 0) {
					this.minute = 0;
				} else {
					this.minute = 60 - all % 60;
				}
			}
			all = all / 60;
			if (this.minute != 0 || this.second != 0) {
				this.hour = 23 - all % 24;
			} else {
				this.hour = 24 - all % 24;
			}
			if (this.hour == 24) {
				this.hour = 0;
			}
		} else {
			this.second = all % 60;
			all = all / 60;
			this.minute = all % 60;
			all = all / 60;
			this.hour = all % 24;
		}
	}

	public void addMinute(int minute) {

		int all = this.hour * 60 * 60 + this.minute * 60 + this.second + minute * 60;

		if (all < 0) {
			all = Math.abs(all);
			if (all % 60 == 0) {
				this.second = 0;
			} else {
				this.second = 60 - all % 60;
			}

			all = all / 60;
			if (this.second != 0) {
				this.minute = 59 - all % 60;
			} else {
				if (all % 60 == 0) {
					this.minute = 0;
				} else {
					this.minute = 60 - all % 60;
				}
			}
			all = all / 60;
			if (this.minute != 0 || this.second != 0) {
				this.hour = 23 - all % 24;
			} else {
				this.hour = 24 - all % 24;
			}
			if (this.hour == 24) {
				this.hour = 0;
			}
		} else {
			this.second = all % 60;
			all = all / 60;
			this.minute = all % 60;
			all = all / 60;
			this.hour = all % 24;
		}
	}

	public void addHour(int hour) {

		int all = this.hour * 60 * 60 + this.minute * 60 + this.second + hour * 60 * 60;

		if (all < 0) {
			all = Math.abs(all);
			if (all % 60 == 0) {
				this.second = 0;
			} else {
				this.second = 60 - all % 60;
			}

			all = all / 60;
			if (this.second != 0) {
				this.minute = 59 - all % 60;
			} else {
				if (all % 60 == 0) {
					this.minute = 0;
				} else {
					this.minute = 60 - all % 60;
				}
			}
			all = all / 60;
			if (this.minute != 0 || this.second != 0) {
				this.hour = 23 - all % 24;
			} else {
				this.hour = 24 - all % 24;
			}
			if (this.hour == 24) {
				this.hour = 0;
			}
		} else {
			this.second = all % 60;
			all = all / 60;
			this.minute = all % 60;
			all = all / 60;
			this.hour = all % 24;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + second;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Watch other = (Watch) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (second != other.second)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Watch [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}

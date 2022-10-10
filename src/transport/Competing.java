package transport;

import java.time.LocalTime;

public interface Competing {


    double getPitStop(double pitStopSeconds);

    double getBestLapTime(double BestLapTimeSeconds);


    double getMaxSpeed(double maxSpeedKilometresOfHours);
}

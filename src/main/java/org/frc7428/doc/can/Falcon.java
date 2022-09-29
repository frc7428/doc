package org.frc7428.doc.can;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

/**
 * Custom wrapping for a TalonFX Motor Controller (Falcon 500)
 */
public class Falcon {
    private final WPI_TalonFX mTalon;

    /**
     * Creates a Falcon with the given CAN ID.
     * 
     * @param canId the CAN ID of the Falcon's TalonFX
     */
    public Falcon(int canId) {
        mTalon = new WPI_TalonFX(canId);
    }

    /**
     * Sets the output of the motor.
     * 
     * @param scaledOutput motor's output between -1.0 and +1.0
     */
    public void set(double scaledOutput) {
        mTalon.set(scaledOutput);
    }

    /**
     * Reports the inversion status of the motor controller.
     * 
     * @return true for inverted
     */
    public boolean isInverted() {
        return mTalon.getInverted();
    }
}
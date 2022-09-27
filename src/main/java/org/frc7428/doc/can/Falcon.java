package org.frc7428.doc.can;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Falcon {
    private final WPI_TalonFX mTalon;

    public Falcon(int canId) {
        mTalon = new WPI_TalonFX(canId);
    }

    public void set(double scaledOutput) {
        mTalon.set(scaledOutput);
    }
}
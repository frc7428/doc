package org.frc7428.doc.can;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Neo {
    private final CANSparkMax mNeo;

    public Neo(int canId) {
        mNeo = new CANSparkMax(canId, MotorType.kBrushless);
    }

    public void set(double scaledOutput) {
        mNeo.set(scaledOutput);
    }
}

package org.upperlevel.corrida.phase;

import lombok.Getter;

public class PhaseManager {
    @Getter
    private Phase currentPhase;

    public void setPhase(Phase phase) {
        if (currentPhase != null) {
            currentPhase.onStop();
        }
        currentPhase = phase;
        if (currentPhase != null) {
            currentPhase.onStart();
        }
    }
}

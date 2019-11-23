package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    ArrayList<Lab> labs = new ArrayList<>();
    LabStatus labStatus;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
    }

    public Lab getLab(String labName) {
        Lab labber = null;
        for (Lab lab : labs)
            if (lab.getName().equals(labName)) {
            labber = lab;
            }

        return labber;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
     if (this.getLab(labName)== (null)){
    throw new UnsupportedOperationException();
        }
    Lab lab = this.getLab(labName);
    lab.labStatus = labStatus;
    }

    public void forkLab(Lab lab) {
        lab.setStatus(labStatus.PENDING);

        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        Lab labber2 = this.getLab(labName);
        return labber2.getStatus();
    }

    public String toString() {
        String listerLabs = "";
        labs.sort(Comparator.comparing(Lab::getName));
        for (Lab lab : labs) {
            listerLabs += String.format("%s > %s\n" , lab.getName(),lab.getStatus());

        }
        return listerLabs.trim();
    }
}

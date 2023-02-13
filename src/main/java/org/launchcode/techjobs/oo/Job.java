package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        String nameString = (getName() != "") ? name : "Data not available";
        String employerString = (getEmployer().getValue() != "") ? getEmployer().getValue() : "Data not available";
        String locationString = (getLocation().getValue() != "") ? getLocation().getValue() : "Data not available";
        String positionTypeString = (getPositionType().getValue() != "") ? getPositionType().getValue() : "Data not available";
        String coreCompetencyString = (getCoreCompetency().getValue() != "") ? getCoreCompetency().getValue() : "Data not available";
        String jobString = "\nID: " + getId() + "\nName: " + nameString + "\nEmployer: " + employerString + "\nLocation: " + locationString + "\nPosition Type: " + positionTypeString + "\nCore Competency: " + coreCompetencyString + "\n";

        if (nameString == "Data not available" && employerString == "Data not available" && locationString == "Data not available" && positionTypeString == "Data not available" && coreCompetencyString == "Data not available") {
            return "OOPS! this job oes not seem to exist.";
        }
        return jobString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}

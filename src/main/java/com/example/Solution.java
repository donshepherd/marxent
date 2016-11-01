package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Don Shepherd
 * @since 10/31/16
 */

@Entity
public class Solution {

    @Id
    @GeneratedValue
    private long id;

    private String solutionName;

    public Solution(String name) {
        this.solutionName = name;
    }

    Solution() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSolutionName() {
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solutions = (Solution) o;

        return id == solutions.id;

    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id +
                ", solutionName='" + solutionName + '\'' +
                '}';
    }
}

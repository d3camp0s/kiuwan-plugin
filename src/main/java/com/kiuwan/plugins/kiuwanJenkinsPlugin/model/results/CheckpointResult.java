package com.kiuwan.plugins.kiuwanJenkinsPlugin.model.results;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CheckpointResult {

	private String result;
	private String name;
	private String description;
	private Integer weight;
	private boolean mandatory;
	private String type;
	private Double score;
	private List<ViolatedRule> violatedRule;
	
	public String getResult() { return result; }
	public void setResult(String result) { this.result = result; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }
	
	public Integer getWeight() { return weight; }
	public void setWeight(Integer weight) { this.weight = weight; }
	
	public boolean isMandatory() { return mandatory; }
	public void setMandatory(boolean mandatory) { this.mandatory = mandatory; }
	
	public String getType() { return type; }
	public void setType(String type) { this.type = type; }
	
	public Double getScore() { return score; }
	public void setScore(Double score) { this.score = score; }
	
	public List<ViolatedRule> getViolatedRule() { return violatedRule; }
	public void setViolatedRule(List<ViolatedRule> violatedRule) { this.violatedRule = violatedRule; }
	
}

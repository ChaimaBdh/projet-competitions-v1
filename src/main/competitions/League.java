package main.competitions;

import main.*;
import java.util.*;

/** A class that represents a League (a kind of competition) */
public class League extends Competition {
	
	/** 
	 * @see main.Competition#Competition
	 * @param comp the competitor's list
	 */
	public League(List<Competitor> comp) {
		super(comp);
	}

	/**
	 * @see main.Competition#play() play(comp) 
	 */
	@Override
	protected void play(List<Competitor> comp) {
		for(Competitor c1 : comp) {
			for(Competitor c2 : comp) {
				if(!c1.equals(c2)) {
					this.playMatch(c1, c2);
				}
			}
		}
	}
	
}

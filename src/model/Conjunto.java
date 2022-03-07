package model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conjunto<T> {

	private Set<T> set1;
	private Set<T> set2;
	
    private List<T>  a;
	private List<T>  b;
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public Conjunto() {
		set1 = new HashSet<T>();
		set2 = new HashSet<T>();

        a = new ArrayList<T>();
        b = new ArrayList<T>();
	}
	
}

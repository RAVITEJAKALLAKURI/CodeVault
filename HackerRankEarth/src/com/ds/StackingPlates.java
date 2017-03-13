package com.ds;

import java.util.*;
 
class StackingPlates {
 
    public static void main(String[] args) {
        int T,n,h,tp,i=0;
        boolean needCrop;
        Scanner sc=new Scanner(System.in);
        //T=sc.nextInt();
        ArrayList<ArrayList<Integer>> done,todo;
        ArrayList<Integer> tmp,all;
        //for(int i=0;i<T;i++)
        while(sc.hasNextInt())
        {
			int crops=0;
			n=sc.nextInt();
			done=new ArrayList<ArrayList<Integer>>();
			todo=new ArrayList<ArrayList<Integer>>();
			all=new ArrayList<Integer>();
			for(int j=0;j<n;j++)
			{
				tmp=new ArrayList<Integer>();
				h=sc.nextInt();
				for(int k=0;k<h;k++)
				{
					tp=sc.nextInt();
					tmp.add(tp);
					all.add(tp);
				}
				todo.add(tmp);
			}
			while(!todo.isEmpty())
			{
				needCrop=false;
				tmp=todo.remove(0);
				for(int j=tmp.size()-1;j>0;j--)
				{
					if(tmp.get(j)!=tmp.get(j-1))
					{
						for(int k=0;k<todo.size();k++)
						{
							for(int l=0;l<todo.get(k).size();l++)
							{
								if(todo.get(k).get(l)<=tmp.get(j) && todo.get(k).get(l)>tmp.get(j-1))
								{
									needCrop=true;
								}
							}
						}
						if(!needCrop)
						{
							for(int k=0;k<done.size();k++)
							{
								for(int l=0;l<done.get(k).size();l++)
								{
									if(done.get(k).get(l)<=tmp.get(j) && done.get(k).get(l)>tmp.get(j-1))
									{
										needCrop=true;
									}
								}
							}
						}
						if(needCrop)
						{
							ArrayList<Integer> newlist = new ArrayList<Integer>();
							for(int k=0;k<j;k++)
							{
								newlist.add(tmp.remove(0));
							}
							todo.add(newlist);
							crops++;
							break;
						}
					}
				}
 
				done.add(tmp);
			}
 
			i++;//added assuming problem is wrong
			System.out.println("Case "+(i)+": "+(crops+done.size()-1));
 
		}
    }
}
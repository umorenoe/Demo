package com.microservicios.demo.animals;

import com.microservicios.demo.interfaces.LandAnimal;

public class OsoHormiguero implements LandAnimal
{
	public OsoHormiguero()
	{
		super();
		live();
	}
	
	@Override
	public void eat( )
	{
		System.out.println( "yumyum... Eating ants." );
	}

	@Override
	public void live( )
	{
		System.out.println( "I'm alive... I'm an Anteater" );
	}

	@Override
	public void move( )
	{
		System.out.println( "Walking...." );
	}

	@Override
	public void run( )
	{
		System.out.println( "Running..." );
	}

	@Override
	public void makeNoise( )
	{
		System.out.println( "Hiss" );
	}
	
}

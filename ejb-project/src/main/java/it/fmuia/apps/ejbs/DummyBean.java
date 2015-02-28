package it.fmuia.apps.ejbs;

import it.fmuia.apps.ejbs.client.DummyLocal;
import it.fmuia.apps.ejbs.client.DummyRemote;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class DummyBean
 */
@Stateless
public class DummyBean implements DummyLocal, DummyRemote
{

	/**
	 * Default constructor.
	 */
	public DummyBean()
	{
		// TODO Auto-generated constructor stub
	}

}

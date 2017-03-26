package com.Imtiyaaz.Assignment03;

/**
 * Created by imtiyaaz on 2017/03/25.
 */
import junit.framework.Assert;
import junit.framework.TestCase;

public class CollectionsTest extends TestCase
{
    Collections collectionsObj = new Collections();
    public void testSetVehicle() throws Exception {
        collectionsObj.setVehicle("Toyota","458 Corolla",1996);
        Assert.assertEquals(collectionsObj.getMake()+collectionsObj.getModel() + collectionsObj.getYear(),"Toyota" +"Corolla" + 1996);
    }

    public void testSetMake() throws Exception {
        collectionsObj.setMake("Golf");
        Assert.assertEquals("Golf","Golf");
    }

    public void testSetModel() throws Exception {
        collectionsObj.setModel("G7");
        Assert.assertEquals("G7","G7");
    }

    public void testSetYear() throws Exception {
        collectionsObj.setYear(2016);
        Assert.assertEquals(2015, 2016);
    }

    public void testGetMake() throws Exception {
        collectionsObj.setMake("Golf");
        Assert.assertEquals("Golf", collectionsObj.getMake());
    }

    public void testGetYear() throws Exception {
        collectionsObj.setYear(2016);
        Assert.assertEquals(2016,collectionsObj.getYear());
    }

    public void testGetModel() throws Exception {
        collectionsObj.setModel("G7");
        Assert.assertEquals("G7", collectionsObj.getModel());
    }
}

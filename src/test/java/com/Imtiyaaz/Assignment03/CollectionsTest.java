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
        collectionsObj.setVehicle("Ferrari","458 Italia",2015);
        Assert.assertEquals(collectionsObj.getMake()+collectionsObj.getModel() + collectionsObj.getYear(),"Ferrari" +"458 Italia" + 2015);
    }

    public void testSetMake() throws Exception {
        collectionsObj.setMake("BMW");
        Assert.assertEquals("BMW","BMW");
    }

    public void testSetModel() throws Exception {
        collectionsObj.setModel("M4");
        Assert.assertEquals("M4","M4");
    }

    public void testSetYear() throws Exception {
        collectionsObj.setYear(2015);
        Assert.assertEquals(2015, 2015);
    }

    public void testGetMake() throws Exception {
        collectionsObj.setMake("BMW");
        Assert.assertEquals("BMW", collectionsObj.getMake());
    }

    public void testGetYear() throws Exception {
        collectionsObj.setYear(2015);
        Assert.assertEquals(2015,collectionsObj.getYear());
    }

    public void testGetModel() throws Exception {
        collectionsObj.setModel("M4");
        Assert.assertEquals("M4", collectionsObj.getModel());
    }
}
package com.example.niv.munch23;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Iterator;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Niv on 13/01/2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class MunchUnitTests {


    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {

        //arrange
        Iterator i=mock(Iterator.class);
        when(i.next()).thenReturn("Munch").thenReturn("23");
        //act
        String result=i.next()+" "+i.next();
        //assert
        assertEquals("Munch 23", result);
    }

}
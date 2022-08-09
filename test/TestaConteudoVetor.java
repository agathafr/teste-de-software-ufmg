int [] EMPTY = {};
int [] ARRAY1 = {(int) 1};
int [] ARRAY234 = {(int) 2, (int) 3, (int) 4};

@Test
public void testContains() {
    assertFalse(Ints.contains(EMPTY, (int) 1));
    assertFalse(Ints.contains(ARRAY1, (int) 2));
    assertFalse(Ints.contains(ARRAY234, (int) 1));
    assertTrue(Ints.contains(ARRAY234, (int) 2));
}
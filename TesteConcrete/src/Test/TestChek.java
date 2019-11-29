package Test;

import org.junit.Test;

import controle.Checkout;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestChek {

	Checkout ck;

	public int setup(String valor) {

		ck = new Checkout();
		ck.scan(valor);

		return ck.total();

	}

	/*
	 * CENARIO DE TESTE CERTOS
	 */
	@Test
	public void Test0() {
		Assert.assertEquals(0, setup(""));
	}

	@Test
	public void TestA() {
		Assert.assertEquals(50, setup("A"));

	}

	@Test
	public void TestAB() {
		Assert.assertEquals(80, setup("AB"));

	}

	@Test
	public void TestCDBA() {
		Assert.assertEquals(115, setup("CDBA"));

	}

	@Test
	public void TestAA() {
		Assert.assertEquals(100, setup("AA"));
	}

	@Test
	public void TestAAA() {
		Assert.assertEquals(130, setup("AAA"));
	}

	@Test
	public void TestAAAA() {
		Assert.assertEquals(180, setup("AAAA"));
	}

	@Test
	public void TestAAAAA() {
		Assert.assertEquals(230, setup("AAAAA"));
	}

	@Test
	public void TestAAAAAA() {
		Assert.assertEquals(260, setup("AAAAAA"));
	}

	@Test
	public void TestAAAB() {
		Assert.assertEquals(160, setup("AAAB"));
	}

	@Test
	public void TestAAABB() {
		Assert.assertEquals(175, setup("AAABB"));
	}

	@Test
	public void TestAAABBD() {
		Assert.assertEquals(190, setup("AAABBD"));
	}

	@Test
	public void TestDABABA() {
		Assert.assertEquals(190, setup("DABABA"));
	}

	/*
	 * CENARIOS DE TESTES INCORRETOS
	 */
	@Test
	public void TestErro0() {
		Assert.assertEquals(1, setup(""));
	}

	@Test
	public void TestErroA() {
		Assert.assertEquals(51, setup("A"));
	}

	@Test
	public void TestErroAB() {
		Assert.assertEquals(81, setup("AB"));

	}

	@Test
	public void TestErro4CDBA() {
		Assert.assertEquals(114, setup("CDBA"));

	}

	@Test
	public void TestErroAA() {
		Assert.assertEquals(101, setup("AA"));
	}

	@Test
	public void TestErroAAA() {
		Assert.assertEquals(131, setup("AAA"));
	}

	@Test
	public void TesteErroAAAA() {
		Assert.assertEquals(181, setup("AAAA"));
	}

	@Test
	public void TestErroAAAAA() {
		Assert.assertEquals(229, setup("AAAAA"));
	}

	@Test
	public void TestErroAAAAAA() {
		Assert.assertEquals(259, setup("AAAAAA"));
	}

	@Test
	public void TestErroAAAB() {
		Assert.assertEquals(159, setup("AAAB"));
	}

	@Test
	public void TestErroAAABB() {
		Assert.assertEquals(177, setup("AAABB"));
	}

	@Test
	public void TestErroAAABBD() {
		Assert.assertEquals(194, setup("AAABBD"));
	}

	@Test
	public void TestErroDABABA() {
		Assert.assertEquals(195, setup("DABABA"));
	}

}

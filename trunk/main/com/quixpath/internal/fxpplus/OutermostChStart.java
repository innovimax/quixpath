package com.quixpath.internal.fxpplus;

import fr.inria.lille.fxp.querylanguage.api.FXPFactory;
import fr.inria.lille.fxp.querylanguage.api.IFXPTerm;

/*package*/class OutermostChStart extends AbstractTerm implements ITerm {

	private final String A;
	private final ITerm F;

	public OutermostChStart(String a, ITerm f) {
		super();
		A = a;
		F = f;
	}

	@Override
	public IFXPTerm expand() {
		return FXPFactory.outerMost(A, F.expand());
	}

	@Override
	public String toString() {
		return "outermost-ch*-" + A + "(" + F + ")";
	}
}
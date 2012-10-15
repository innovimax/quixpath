/*
QuiXPath: efficient evaluation of XPath queries on XML streams.
Copyright (C) 2011 Innovimax and INRIA

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either version 3
of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.quixpath.internal.fxpplus;

import fr.inria.lille.fxp.querylanguage.api.IFXPFactory;
import fr.inria.lille.fxp.querylanguage.api.IFXPTerm;

/*package*/class OutermostChStar extends AbstractTerm implements ITerm {

	private final String A;
	private final ITerm F;

	public OutermostChStar(String a, ITerm f) {
		super();
		A = a;
		F = f;
	}

	@Override
	public IFXPTerm expand(final IFXPFactory fxpTermFactory) {
		return fxpTermFactory.outerMost(A, F.expand(fxpTermFactory));
	}

	@Override
	public String toString() {
		return "outermost-ch*-" + A + "(" + F + ")";
	}

	public boolean containsChildStar() {
		return true;
	}

}

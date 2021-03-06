/*
  Copyright (C) 2008-2014 Helge Hess

  This file is part of OpenGroupware.org (OGo)

  OGo is free software; you can redistribute it and/or modify it under
  the terms of the GNU General Public License as published by the
  Free Software Foundation; either version 2, or (at your option) any
  later version.

  OGo is distributed in the hope that it will be useful, but WITHOUT ANY
  WARRANTY; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
  License for more details.

  You should have received a copy of the GNU General Public
  License along with OGo; see the file COPYING.  If not, write to the
  Free Software Foundation, 59 Temple Place - Suite 330, Boston, MA
  02111-1307, USA.
*/
package org.opengroupware.logic.auth;

import java.security.Principal;

/**
 * The interface extends a JAAS Principal with the id of the principal in the
 * OGo database. The 'authz' module needs that to construct proper queries in
 * the database.
 * <p>
 * The two subclasses are OGoAccountPrincipal and OGoTeamPrincipal.
 * 
 * @author helge
 */
public interface IOGoPrincipal extends Principal {
  
  public Number id();

}

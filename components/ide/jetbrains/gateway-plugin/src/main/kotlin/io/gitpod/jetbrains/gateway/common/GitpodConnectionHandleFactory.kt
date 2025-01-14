// Copyright (c) 2023 Gitpod GmbH. All rights reserved.
// Licensed under the GNU Affero General Public License (AGPL).
// See License.AGPL.txt in the project root for license information.

package io.gitpod.jetbrains.gateway.common

import com.jetbrains.gateway.api.GatewayConnectionHandle
import com.jetbrains.rd.util.lifetime.Lifetime
import io.gitpod.jetbrains.gateway.GitpodConnectionProvider
import javax.swing.JComponent

interface GitpodConnectionHandleFactory {
    fun createGitpodConnectionHandle(
            lifetime: Lifetime,
            component: JComponent,
            params: GitpodConnectionProvider.ConnectParams
    ): GatewayConnectionHandle
}


SUMMARY = "Multi-Language Server WebSocket proxy for Jupyter Notebook/Lab server"
HOMEPAGE = "https://jupyterlab-lsp.readthedocs.io/"
AUTHOR = "jupyter-lsp Contributors <project.jupyter@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c4ff345ebb091fcbc5290142e324da5"

SRC_URI[sha256sum] = "8ebbcb533adb41e5d635eb8fe82956b0aafbf0fd443b6c4bfa906edeeb8635a1"

PYPI_PACKAGE = "jupyter-lsp"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
  nodejs \
  ${PYTHON_PN}-python-language-server \
  ${PYTHON_PN}-fcntl \
"

FILES:${PN} += "\
  /usr/etc \
  /usr/etc/jupyter \
  /usr/etc/jupyter/jupyter_server_config.d \
  /usr/etc/jupyter/jupyter_notebook_config.d \
  /usr/etc/jupyter/jupyter_server_config.d/jupyter-lsp-jupyter-server.json \
  /usr/etc/jupyter/jupyter_notebook_config.d/jupyter-lsp-notebook.json \
"
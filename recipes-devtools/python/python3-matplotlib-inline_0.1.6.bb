
SUMMARY = "Inline Matplotlib backend for Jupyter"
HOMEPAGE = "https://github.com/ipython/matplotlib-inline"
AUTHOR = "IPython Development Team <ipython-dev@scipy.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4692a0eb42ca54892399db2cb35e61e"

SRC_URI = "https://files.pythonhosted.org/packages/d9/50/3af8c0362f26108e54d58c7f38784a3bdae6b9a450bab48ee8482d737f44/matplotlib-inline-0.1.6.tar.gz"
SRC_URI[md5sum] = "aded9a57e2f526f76b3a4851d5528d4f"
SRC_URI[sha256sum] = "f887e5f10ba98e8d2b150ddcf4702c1e5f8b3a20005eb0f74bfdbd360ee6f304"

PYPI_PACKAGE = "matplotlib-inline"

DEPENDS += "\
"

inherit pypi python_hatchling

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-matplotlib \
"